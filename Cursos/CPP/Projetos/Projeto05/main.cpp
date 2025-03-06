#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

class Personagem {
protected:
    std::string nome;
    int vida;
    int nivel;

public:
    Personagem(std::string n, int v, int lvl) : nome(n), vida(v), nivel(lvl) {}

    std::string get_nome() { return nome; }
    int get_vida() { return vida; }
    int get_nivel() { return nivel; }

    void receber_ataque(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    virtual void atacar(Personagem &alvo) {
        int dano = rand() % (nivel * 9 - nivel * 5 + 1) + nivel * 5;
        alvo.receber_ataque(dano);
        std::cout << nome << " atacou " << alvo.get_nome() << " e causou " << dano << " de dano\n";
    }
};

class Heroi : public Personagem {
    std::string habilidade;

public:
    Heroi(std::string n, int v, int lvl, std::string hab) : Personagem(n, v, lvl), habilidade(hab) {}

    void ataque_especial(Personagem &alvo) {
        int dano = rand() % (nivel * 20 - nivel * 10 + 1) + nivel * 10;
        alvo.receber_ataque(dano);
        std::cout << nome << " usou " << habilidade << " e causou " << dano << " de dano\n";
    }
};

class Inimigo : public Personagem {
    std::string tipo;

public:
    Inimigo(std::string n, int v, int lvl, std::string t) : Personagem(n, v, lvl), tipo(t) {}
};

class Jogo {
    Heroi heroi;
    Inimigo inimigo;

public:
    Jogo() : heroi("Link", 1000, 8, "Jump with Sword"), inimigo("Dark Link", 900, 7, "Final Boss") {}

    void iniciar_batalha() {
        std::cout << "Iniciando batalha\n";
        while (heroi.get_vida() > 0 && inimigo.get_vida() > 0) {
            std::cout << "\nDetalhes dos personagens\n";
            std::cout << "Herói: " << heroi.get_nome() << " Vida: " << heroi.get_vida() << " Nível: " << heroi.get_nivel() << "\n";
            std::cout << "Inimigo: " << inimigo.get_nome() << " Vida: " << inimigo.get_vida() << " Nível: " << inimigo.get_nivel() << "\n";

            heroi.atacar(inimigo);
            if (inimigo.get_vida() > 0) {
                inimigo.atacar(heroi);
            }

            if (heroi.get_vida() <= 0 || inimigo.get_vida() <= 0) break;
        }

        if (heroi.get_vida() > 0) {
            std::cout << "Parabéns! Você venceu a batalha!\n";
            std::cout << "Você salvou o reino de Hyrule!\n";
        } else {
            std::cout << "Você perdeu a batalha!\n";
        }
    }
};

int main() {
    srand((unsigned int)time(NULL)); // Inicializa a semente de randomização
    Jogo jogo;
    jogo.iniciar_batalha();
    return 0;
}
