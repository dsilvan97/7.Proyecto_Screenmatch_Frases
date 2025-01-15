import getDatos from "./getDatos.js";

const btnSortear = document.querySelector('.btn-sortear');
const fichaDescripcion = document.getElementById('ficha-descripcion');

function cargarInfoSerie() {
  getDatos(`/series/frases`)
      .then(data => {
        const serie = data[0];
        fichaDescripcion.innerHTML = `
              <img src="${serie.poster}" alt="${serie.titulo}" />
              <div>
                  <h2>${serie.titulo}</h2>
                  <div class="descripcion-texto">
                      <p><i>"${serie.frase}"</i></p>
                      <p><b>Citado por:</b> ${serie.personaje}</p>
                  </div>
              </div>
          `;
      })
      .catch(error => {
          console.error('Error al obtener las informaciones de la serie:', error);
      });
}


window.onload = cargarInfoSerie();
btnSortear.addEventListener('click', cargarInfoSerie);