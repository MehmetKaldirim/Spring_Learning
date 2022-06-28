local brew_path="/opt/homebrew/bin"
local brew_opt_path="/opt/homebrew/opt"
local nvm_path="$HOME/.nvm"

export PATH="${brew_path}:${PATH}"
export NVM_DIR "${nvm_path}"

[ -s "${brew_opt_path}/nvm/nvm.sh" ] && . "${brew_opt_path}/nvm/nvm.sh"
[ -s "${brew_opt_path}/nvm/etc/bash_completion.d/nvm" ] && . "${brew_opt_path}/nvm/etc/bash_completion.d/nvm"
