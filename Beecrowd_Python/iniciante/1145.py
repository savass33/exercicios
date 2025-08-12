x, y = map(int, input().split())
cont = 0

for i in range(1, y + 1):
    cont += 1
    if cont == x:
        print(i)
        cont = 0
    else:
        print(i, end=" ")