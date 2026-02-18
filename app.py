from flask import Flask, render_template, request, redirect
from models import db, Circuito, nuevo_circuito
from calculos import corriente

app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'postgresql://postgres:postgres@localhost:5432/Electricidad'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False

db.init_app(app)

@app.route('/')
def hello():
    circuitos_db = Circuito.query.all() 
    return render_template('Index.html', circuitos=circuitos_db)

@app.route('/guardar', methods=['POST'])    
def guardar():
    carga = round(float(request.form['carga_w']))
    tension = round(float(request.form['tension']))
    resultado = corriente(round(tension), round(carga))#Envia los datos a archivo calculos.py
    print(f"DEBUG APP: he recibido: {round(resultado)}")
    return render_template('Index.html', result = round(resultado))



if __name__ == '__main__':
    app.run(debug=True, port=5000)