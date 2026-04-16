from flask import Flask, render_template, request, redirect
#from models import db, Circuito, nuevo_circuito
from calculos import corriente, caidavoltaje

app = Flask(__name__)

#app.config['SQLALCHEMY_DATABASE_URI'] = 'postgresql://postgres:postgres@localhost:5432/Electricidad'
#app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

#db.init_app(app)

@app.route('/')
def hello():
    return render_template('Index.html')

@app.route('/circuitos-electricos')
def circuitos():
    return render_template('circuitos.html')

@app.route('/diseños')
def disenos():
    return render_template('diseños.html')

@app.route('/memorias-de-calculo')
def memorias():
    return render_template('memoriasCalculo.html')

@app.route('/guardar', methods=['POST'])    
def guardar():
    carga = round(float(request.form['carga_w']))
    tension = round(float(request.form['tension']))
    caidaTension = round(float(request.form['longitud']))
    impedancia = round(float(request.form['impedancia']))
    resultado = corriente(round(tension), round(carga))#Envia los datos a archivo calculos.py
    caida = caidavoltaje(round(caidaTension), (impedancia), round(resultado))
    print(f"DEBUG APP: he recibido: {round(resultado)}")
    return render_template('Index.html', result = round(resultado), resCaidaTen = round(caida))



if __name__ == '__main__':
    app.run(debug=True, port=5000)