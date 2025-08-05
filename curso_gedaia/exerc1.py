n=int(input())
num_lista = []
for _ in range(n):
    add_num = int(input())
    num_lista.append(add_num)

num_unicos = set(num_lista)
print(len(num_unicos))