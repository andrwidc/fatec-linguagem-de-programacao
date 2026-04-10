def calcular_roi(ganho, investimento):
    if investimento == 0:
        return None
    else:
        return (ganho - investimento) / investimento

ganho = float(input("Digite o ganho obtido: "))
investimento = float(input("Digite o valor do investimento: "))

resultado = calcular_roi(ganho, investimento)

if resultado is None:
        print("Erro: investimento não pode ser 0.")
else:
        print(f"ROI: {resultado:.2f} ({resultado * 100:.2f}%)")