x: int = int(input())
z: int = int(input())

while (z <= x):
    z: int = int(input())

soma = x
contador = 1
proximo = x + 1

for i in range (x, z+1):
    soma += i
    contador+=1
    if soma > z:
        break

print(contador)

