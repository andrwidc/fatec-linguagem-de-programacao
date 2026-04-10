quantidade = int(input("Digite a quantidade em estoque: "))

if quantidade < 1:
    print("Status: Em Falta.")
elif quantidade < 5:
    print("AVISO: alerta de estoque baixo!")
else:
    print("Estoque OK.")