n = int(input())

anterior = 0
atual = 1

for i in range(n):
    if i == 0:
        print(anterior, end="")  # imprime 0 sem espaço antes
    else:
        print(" ", atual, end="")  # imprime os próximos com espaço antes
        proximo = anterior + atual
        anterior = atual
        atual = proximo

print()  # quebra de linha no final
