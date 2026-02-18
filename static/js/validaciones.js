// Este código detecta el tipo de sistema en tiempo real
document.addEventListener('DOMContentLoaded', () => {
    const inputTension = document.getElementById('input_tension');
    const badgeSistema = document.getElementById('tipo_sistema');

    if (inputTension && badgeSistema) {
        inputTension.addEventListener('input', (e) => {
            const v = parseFloat(e.target.value);

            if (!v || v === 0) {
                badgeSistema.classList.add('hidden');
                return;
            }

            badgeSistema.classList.remove('hidden');

            // Lógica igual a tu archivo calculos.py (Límite 200V)
            if (v >= 208) {
                badgeSistema.textContent = '⚡ SISTEMA TRIFÁSICO';
                badgeSistema.className = 'text-[12px] font-bold mt-1 px-2 py-0.5 rounded-full w-fit bg-yellow-600 text-black shadow-sm';
            } else {
                badgeSistema.textContent = '🔌 SISTEMA MONOFÁSICO';
                badgeSistema.className = 'text-[12px] font-bold mt-1 px-2 py-0.5 rounded-full w-fit bg-blue-600 text-white shadow-sm';
            }

            //Lógica de tensión por debajo de 120v

        if(v < 120 && v >= 1) {
            badgeSistema.textContent = '📱 SISTEMA ELECTRONICO O FUENTE';
                badgeSistema.className = 'text-[12px] font-bold mt-1 px-2 py-0.5 rounded-full w-fit bg-yellow-600 text-black shadow-sm';
        }
        });
    }
});