from flask_sqlalchemy import SQLAlchemy

db = SQLAlchemy()

class Circuito(db.Model):
    __tablename__ = 'circuitos'
    
    # Llave primaria con el nombre exacto de tu DB
    id_cicutos = db.Column(db.Integer, primary_key=True)
    
    # Campos técnicos mapeados de pgAdmin
    corriente_total = db.Column(db.Numeric(10, 2))
    cantidad_elementos_conectados = db.Column(db.String(30))
    carga_w = db.Column(db.Numeric(10, 2))
    tension_v = db.Column(db.Integer)
    id_protecciones = db.Column(db.Integer)
    id_conductores = db.Column(db.Integer)
    longitud_m = db.Column(db.Numeric(6, 2))
    fases = db.Column(db.SmallInteger)
    factor_potencia = db.Column(db.Numeric(6, 2))
    uso = db.Column(db.String(500))
    circuitos_especiales = db.Column(db.Boolean)

def nuevo_circuito(conexion, n_cto, v, w):
    cur = conexion.cursor()
    cur.execute("INSERT INTO circuitos (longitud_m, tension_v, carga_w) VALUES (%s, %s, %s)", (n_cto, v, w))
    conexion.commit()
    cur.close()