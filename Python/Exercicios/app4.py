# verificar se o nome de usuário e senha correspondem aos valores esperados

usuario_esperado = "arthur"
senha_esperada = "Yehoshua2026"

usuario_input = "arthur"
senha_input = "Yehoshua2025"

if usuario_input == usuario_esperado and senha_input == senha_esperada:
    print("Acesso concedido")
else:
    print("Acesso negado")