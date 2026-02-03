def classificar_musica(genero_favorito, genero_musica):
    if genero_favorito == genero_musica:
        return 'recomendada'
    elif genero_favorito == 'Pop' or genero_favorito == 'Rock':
        return 'neutra'
    else:
        return 'não recomendada'

resultado = classificar_musica('Rock', 'Pop')
print(resultado)
resultado = classificar_musica('Jazz', 'Clássica')
print(resultado)
resultado = classificar_musica('Clássica', 'Clássica')
print(resultado)