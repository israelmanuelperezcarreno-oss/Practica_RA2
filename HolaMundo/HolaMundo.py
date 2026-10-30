# Programa básico en Python
def mostrar_saludos():
    print("==================================")
    print("¡Hola Mundo desde Python en Eclipse!")
    print("==================================")

    # Un pequeño bucle para mostrar la simplicidad de Python
    for i in range(1, 4):
        print(f"Mensaje número {i}")

if __name__ == "__main__":
    mostrar_saludos()