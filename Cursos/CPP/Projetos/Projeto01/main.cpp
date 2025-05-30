#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main (){
    cout << "***************************************" << endl;
    cout << "* Boas vindas ao Jogo da Adivinhação! *" << endl;
    cout << "***************************************" << endl;

    cout << "Escolha o seu nível de dificuldade: " << endl;
    cout << "Fácil (F) Médio (M) Difícil (D)" << endl;
    char dificuldade;
    cin >> dificuldade;

    int numero_de_tentativas = 0;

    if(dificuldade == 'F'){
        numero_de_tentativas = 15;
    } else if(dificuldade == 'M'){
        numero_de_tentativas = 10;
    } else {
        numero_de_tentativas = 5;
    }

    srand(time(NULL));
    const int numero_secreto = rand() % 100;

    int chute = 0;
    bool nao_acertou = true;
    int tentativas = 0;
    double pontos = 1000.0;
    
    for(tentativas = 1; tentativas <= numero_de_tentativas; tentativas++){
        cout << "Tentativa " << tentativas << endl;
        cout << "Digite o seu chute: ";
        cin >> chute;
        double pontos_perdidos = abs(chute - numero_secreto) / 2.0;
        pontos = pontos - pontos_perdidos;
        cout << "O valor do seu chute é: " << chute << endl;
        bool acertou = chute == numero_secreto;
        bool maior = chute > numero_secreto;
        if(acertou){
            cout << "Parabéns! Você acertou o número secreto!" << endl;
            nao_acertou = false;
            break;
        } else if(maior){
            cout << "Seu chute foi maior que o número secreto." << endl;
        } else {
            cout << "Seu chute foi menor que o número secreto." << endl;
        }
        if(acertou){
            cout << "Parabéns! Você acertou o número secreto!" << endl;
            nao_acertou = false;
            break;
        }
    }
    cout << "O número secreto é: " << numero_secreto << endl;
    cout << "Fim de jogo!" << endl;
    if(nao_acertou) {
        cout << "Você perdeu. Tente novamente!" << endl;
    } else {
        cout << "Você acertou o número secreto em " << tentativas << " tentativas" << endl;
        cout.precision(2);
        cout << fixed;
        cout << "Sua pontuação foi de " << pontos << " pontos" << endl;
    }
}
