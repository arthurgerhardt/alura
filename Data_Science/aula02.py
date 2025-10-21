def foo(x):
    return x + 1

def bar(y):
    return y * 2

valor = 3

resultado = (foo if valor % 2 == 0 else bar)(valor)