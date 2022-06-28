package com.cydeo.controller;

import com.cydeo.entity.Cinema;
import com.cydeo.repository.CinemaRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Cinemas", description = "Cinema CRUDs Operations")
public class CinemaController {

    private final CinemaRepository cinemaRepository;

    public CinemaController(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @GetMapping("/cinemas")
    @Operation(summary = "Read all cinemas") //we add name the method
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved cinemas (OK)",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", description = "Something goes wrong", content = @Content),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content)
    })
    public List<Cinema> readAllCinemas(){
        return cinemaRepository.findAll();
    }

}
