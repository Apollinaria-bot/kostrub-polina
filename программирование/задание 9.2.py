def transpose(matrix):
  n = len(matrix)
  transposed_matrix = [[0 for _ in range(n)] for _ in range(n)]
  for i in range(n):
    for j in range(n):
      transposed_matrix[j][i] = matrix[i][j]
  return transposed_matrix

n = int(input("Введите порядок матрицы n: "))
matrix = []
print("Введите элементы матрицы:")
for i in range(n):
  row = list(map(int, input().split()))
  matrix.append(row)

transposed_matrix = transpose(matrix)

print("Транспонированная матрица:")
for row in transposed_matrix:
  print(row)
