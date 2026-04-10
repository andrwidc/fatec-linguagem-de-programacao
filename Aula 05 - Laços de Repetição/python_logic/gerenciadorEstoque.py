produtos = []

while True:
    print("\n1 - Adicionar novo produto")
    print("2 - Listar produtos")
    print("3 - Sair")

    opcao = input("Escolha uma opção: ")

    if opcao == "1":
        nome = input("Nome do produto: ")
        quantidade = int(input("Quantidade em estoque: "))
        preco = float(input("Preço unitário: "))

        if quantidade < 0:
            print("Erro: quantidade não pode ser negativa.")
        else:
            produtos.append([nome, quantidade, preco])
            print("Produto adicionado com sucesso!")

    elif opcao == "2":
        print("\n=== Produtos em estoque ===")
        for p in produtos:
            print("Nome:", p[0])
            print("Quantidade:", p[1])
            print("Preço:", p[2])
            print("-------------------")

    elif opcao == "3":
        print("Saindo...")
        break

    else:
        print("Opção inválida.")