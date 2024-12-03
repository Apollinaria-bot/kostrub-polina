def find_min_max_sum_rows(matrix):
    min_row_index = 0
    max_row_index = 0

    min_sum = sum(matrix[min_row_index])
    max_sum = min_sum

    for i in range(1, len(matrix)):
        current_sum = sum(matrix[i])
        if current_sum < min_sum:
            min_sum = current_sum
            min_row_index = i
        if current_sum > max_sum:
            max_sum = current_sum
            max_row_index = i

    return matrix[min_row_index], min_sum, matrix[max_row_index], max_sum

with open('кострубполинаивановна_у-243_vvod.txt', 'r') as file:
    matrix = [list(map(int, line.split())) for line in file]

min_row, min_sum, max_row, max_sum = find_min_max_sum_rows(matrix)

with open('кострубполинаивановна_у-243_vivod.txt', 'w') as file:
    file.write(f"Строка с минимальной суммой: {min_row}, сумма: {min_sum}\n")
    file.write(f"Строка с максимальной суммой: {max_row}, сумма: {max_sum}\n")
