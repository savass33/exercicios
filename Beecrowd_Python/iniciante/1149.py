valores = list(map(int, input().split()))
a = valores[0]


# O [1: ] significa um "slice", ou seja, pegará tudo a partir do indice 1
for val in valores[1: ]:
    if val > 0:
        n = val
        break

while (n <= 0):
    n = int(input())

soma = 0

for i in range(n):
    soma += a + i
print(soma)