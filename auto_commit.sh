#!/bin/bash

# Navega até a pasta do repositório
cd "$(dirname "$0")"

# Adiciona todas as mudanças (arquivos novos e modificados)
git add .

# Verifica se há mudanças para commit
if git diff --cached --quiet; then
    echo "Nenhuma mudança para commitar."
    exit 0
fi

# Comita com uma mensagem automática contendo a data e hora
git commit -m "Atualização automática - $(date '+%Y-%m-%d %H:%M:%S')"

# Envia para o repositório remoto
git push

echo "Commit e push realizados com sucesso!"
