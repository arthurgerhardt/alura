import pandas as pd

# Se houver problemas de conexão, baixe o arquivo e use o caminho local, por exemplo:
# notas = pd.read_csv("ratings.csv")
notas = pd.read_csv("https://raw.githubusercontent.com/alura-cursos/data-science-analise-exploratoria/main/Aula_0/ml-latest-small/ratings.csv")

# Exibe as 5 primeiras linhas do DataFrame
print(notas.head())
# Exibe as 5 últimas linhas do DataFrame
print(notas.tail())