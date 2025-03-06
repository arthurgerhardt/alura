#include <iostream>
#include <string>
#include <map>
#include <vector>

using namespace std;

const string PALAVRA_SECRETA = "MELANCIA";
map<char, bool> chutou;
vector<char> chutes_errados;
bool letra_existe(char chute)
{
    for (char letra : PALAVRA_SECRETA)
    {
        if (chute == letra)
        {
            return true;
        }
    }
    return false;
}

bool nao_acertou()
{
    for (char letra : PALAVRA_SECRETA)
    {
        if (!chutou[letra])
        {
            return true;
        }
    }
    return false;
}

bool nao_enforcou()
{
    return chutes_errados.size() < 5;
}
int main()
{
    cout << "*****************************************" << endl;
    cout << "*******Bem-vindo ao jogo da forca!*******" << endl;
    cout << "*****************************************" << endl;

    while (nao_acertou() && nao_enforcou())
    {
        cout << "Chutes errados: ";
        for (char letra : chutes_errados)
        {
            cout << letra << " ";
        }
        cout << endl;

        // Atualiza a condição de nao_enforcou
        cout << "Chutes errados: ";
        for (char letra : chutes_errados)
        {
            cout << letra << " ";
        }
        cout << endl;
        for (char letra : PALAVRA_SECRETA)
        {
            if (chutou[letra])
            {
                cout << letra << " ";
            }
            else
            {
                cout << "_ ";
            }
        }
        cout << endl;
        char chute;
        cout << "Digite uma letra da palavra secreta: ";
        cin >> chute;

        chutou[chute] = true;

        if (letra_existe(chute))
        {
            cout << "Você acertou! Seu chute está na palavra." << endl;
        }
        else
        {
            cout << "Você errou! Seu chute não está na palavra." << endl;
            chutes_errados.push_back(chute);
            cout << "Você perdeu. Tente novamente!" << endl;
        }
    }
    cout << "Fim de jogo!" << endl;
    cout << "A palavra secreta é: " << PALAVRA_SECRETA << endl;
}
