#!/bin/bash

# Navega até o repositório
cd C:\pratica-programacao || exit

# Mensagem de commit automática
msg="Atualização automática - $(date +'%Y-%m-%d %H:%M:%S')"

# Executa os comandos Git
git add .
git commit -m "$msg"
git push origin main
