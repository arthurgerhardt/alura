# App de Sabor Express, um app para restaurantes delivery.
# Desenvolvido durante o curso de Python da Alura.
import os

def exibir_nome_programa():
    print("""
      
░██████╗░█████╗░██████╗░░█████╗░██████╗░  ███████╗██╗░░██╗██████╗░██████╗░███████╗░██████╗░██████╗
██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗  ██╔════╝╚██╗██╔╝██╔══██╗██╔══██╗██╔════╝██╔════╝██╔════╝
╚█████╗░███████║██████╦╝██║░░██║██████╔╝  █████╗░░░╚███╔╝░██████╔╝██████╔╝█████╗░░╚█████╗░╚█████╗░
░╚═══██╗██╔══██║██╔══██╗██║░░██║██╔══██╗  ██╔══╝░░░██╔██╗░██╔═══╝░██╔══██╗██╔══╝░░░╚═══██╗░╚═══██╗
██████╔╝██║░░██║██████╦╝╚█████╔╝██║░░██║  ███████╗██╔╝╚██╗██║░░░░░██║░░██║███████╗██████╔╝██████╔╝
╚═════╝░╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝░░╚═╝  ╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝░░╚═╝╚══════╝╚═════╝░╚═════╝░
      \n""")

# Definição das funções do app
def cadastrar_restaurante():
    os.system('clear')  # Limpa a tela do terminal
    print("Função de cadastro de restaurante.")

def listar_restaurantes():
    os.system('clear')  # Limpa a tela do terminal
    print("Função de listagem de restaurantes.")

def ativar_restaurante():
    os.system('clear')  # Limpa a tela do terminal
    print("Função de ativação de restaurante.")
    
def finalizar_app():
    os.system('clear')  # Limpa a tela do terminal
    print("Obrigado por usar o Sabor Express. Até a próxima!")

# Bloco de repetição para o menu do app
def exibir_menu():
    while True:
        print("1. Cadastrar restaurante")
        print("2. Listar restaurantes")
        print("3. Ativar restaurante")
        print("4. Sair \n")
        opcao_escolhida = input("Escolha uma opção: ")
        print(f'Você escolheu a opção {opcao_escolhida}')
        escolher_opcoes(opcao_escolhida)
        if opcao_escolhida == "4":
            break

def escolher_opcoes(opcao_escolhida):
    # Bloco condicional para tratar as opções do menu
    if opcao_escolhida == "1":
        cadastrar_restaurante()
    elif opcao_escolhida == "2":
        listar_restaurantes()
    elif opcao_escolhida == "3":
        ativar_restaurante()
    elif opcao_escolhida == "4":
        pass  # A opção de saída é tratada no loop principal
    else: # Tratamento da opção de saída
        finalizar_app()

def main():
    exibir_nome_programa()
    exibir_menu()

if __name__ == "__main__":
    main()
