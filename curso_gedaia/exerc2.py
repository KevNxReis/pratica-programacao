import sys

def soma():
    try:
        n = int(input())
        lista = input()
        list_num = lista.split()
        valor = []
        for numer in list_num:
            valor.append(int(numer))

        total_soma = sum(valor)

        print(total_soma)

    except (ValueError, IOError):
        print("ta errado meu mano")

soma()


