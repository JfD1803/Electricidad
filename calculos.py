import math

def corriente(tension_v, carga_w, factor_potencia=0.9):
    if tension_v == 0: 
        return 0
    
    # Si la tensión es 220V o más, asumimos trifásico
    if tension_v >= 220:
        # Fórmula trifásica: I = P / (V * √3 * FP)
        # Usamos math.sqrt(3) que es aproximadamente 1.732
        resultado = carga_w / (tension_v * math.sqrt(3) * factor_potencia)
        print(f"Calculando sistema TRIFÁSICO a {tension_v}V")
    else:
        # Sistema Monofásico: I = P / V
        resultado = carga_w / tension_v
        print(f"Calculando sistema MONOFÁSICO a {tension_v}V")
        
    # Redondeamos a 2 decimales para que se vea bien en tu interfaz de Flask
    resultado = round(resultado, 2)
    print(f"El resultado es: {resultado} A")
    return resultado
    
def caidavoltaje(distancia_circuito, impedancia, corriente, es_trifasico=False):
        if distancia_circuito == 0: return 0
        constante = 1.732 if es_trifasico else 2
        caida = ((constante * distancia_circuito * impedancia * corriente)/1000)
        print (f"Caida de tension del circuito: {caida}")
        return caida