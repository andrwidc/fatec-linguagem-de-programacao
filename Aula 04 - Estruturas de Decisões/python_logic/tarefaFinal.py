nome_do_produto = input("Insira o nome do produto: ")
quantidade_do_estoque = int(input("Insira quantidade em estoque: "))
preco_unitario = float(input("Insira o valor do produto:" ))

if(preco_unitario < 0):
    print("Valor inválido (Preço negativo)")


print(f"\nNome do produto: {nome_do_produto}")

if(quantidade_do_estoque < 1):
    print("Status: Em Falta.")
elif(quantidade_do_estoque < 5):
    print("AVISO: alerta de estoque baixo!")
else:
    print("Estoque OK.")
    
print(f"Quantidade em estoque: {quantidade_do_estoque} itens disponíveis")
print(f"Valor do produto: R${preco_unitario: .2f}")