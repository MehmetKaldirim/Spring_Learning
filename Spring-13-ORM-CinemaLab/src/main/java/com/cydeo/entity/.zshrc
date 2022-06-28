local brew_path="/opt/homebrew/bin"
local brew_opt_path="/opt/homebrew/opt"
local nvm_path="$HOME/.nvm"

export PATH="${brew_path}:${PATH}"
export NVM_DIR="${nvm_path}"
  [ -s "/opt/homebrew/opt/nvm/nvm.sh" ] && \. "/opt/homebrew/opt/nvm/nvm.sh"  # This loads nvm
  [ -s "/opt/homebrew/opt/nvm/etc/bash_completion.d/nvm" ] && \. "/opt/homebrew/opt/nvm/etc/bash_completion.d/nvm"  # This loads nvm bash_completion
