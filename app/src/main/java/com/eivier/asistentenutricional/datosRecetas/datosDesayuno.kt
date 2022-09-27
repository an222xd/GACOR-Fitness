package com.eivier.asistentenutricional.datos_root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta

import com.eivier.asistentenutricional.R
import com.eivier.asistentenutricional.modelos.ModeloReceta
import kotlinx.android.synthetic.main.content_recetas_opciones.view.*

/**
 * Metodo colocar Datos para Desayuno al modelo _root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta
 * Recibe: Nombre: String,
 * dificultad: String,
 * tiempo: String,
 * porciones: Int,
 * ingredientes: String,
 * preparacion: String,
 * imagen: String; Intenet, libreria Glide
 *  Regresa un ArrayList
 */

class datosDesayuno {

    companion object {

        fun creacionDatosDesayuno(): ArrayList<ModeloReceta> {
            val listaDesayuno = ArrayList<ModeloReceta>()
            listaDesayuno.add(
                ModeloReceta(
                    "chilaquiles rojos",
                    "Baja",
                    "25 minutos",
                    2,
                    "4 Piezas Chile de árbol seco limpios y sin semillas\n" +
                            "2 Tazas Agua\n" +
                            "4 Cucharadas Aceite de maíz\n" +
                            "1 Bolsa Totopos (500 g)\n" +
                            "1 Lata Media Crema NESTLÉ®\n" +
                            "200 Gramos Queso Panela rallado\n" +
                            "1 Cubo Concentrado de Tomate con Pollo CONSOMATE® en trozos\n" +
                            "1/4 Pieza Cebolla\n" +
                            "3 Piezas Jitomate\n",
                    "Licúa\n" +
                            "1.-Para la salsa, licúa los chiles de árbol con la cebolla, jitomate, el agua y el Concentrado de Tomate con Pollo CONSOMATE®.\n" +
                            "Freir\n" +
                            "2.-En una sartén calienta el aceite y fríe la salsa por 5 minutos o hasta que espese un poco, agrega los totopos a la salsa y mezcla bien.\n" +
                            "Presentación\n" +
                            "3.-Sirve en un plato, decora con Media Crema NESTLÉ® y el queso panela. Ofrece.\n" +
                            "Consejo culinario\n" +
                            "Consejo culinario: Puedes agregar puré de tomate para dar un color rojo uniforme en la salsa.",
                    R.drawable.lo
                )
            )
            listaDesayuno.add(
                ModeloReceta(
                    "Arroz con chorizo",
                    "Baja",
                    "44 minutos",
                    1,
                    "2 Tazas Agua\n" +
                            "1 Cubo Concentrado de Tomate con Pollo CONSOMATE®\n" +
                            "2 Piezas Chile guajillo sin semillas y remojado en agua caliente\n" +
                            "2 Piezas Chorizo desmoronado (400 g)\n" +
                            "1 Taza Arroz lavado y escurrido\n" +
                            "1/2 Pieza Chorizo verde, frito y picado (100 g)\n" +
                            "3 Ramitas Cilantro fresco desinfectado y picado finamente",
                    "Licuar\n" +
                            "Licúa el agua con el Concentrado de Tomate con Pollo CONSOMATE® y los chiles guajillo, cuela y reserva.\n" +
                            "\n" +
                            "Freír\n" +
                            "En una cacerola fríe el chorizo hasta que dore, retíralo, añade el arroz y fríe hasta que dore ligeramente; vierte lo que licuaste, tapa y cocina a fuego bajo por 20 minutos o hasta que el arroz esté cocido. Agrega el chorizo y mezcla.\n" +
                            "\n" +
                            "Ofrecer\n" +
                            "Decora con un poco de chorizo verde y cilantro. Ofrece.\n" +
                            "\n" +
                            "Consejo culinario\n" +
                            "Si el arroz aún está un poco duro después de los 20 minutos, agrega ¼ de taza de agua, tapa y cocina por unos minutos.\n" +
                            "\n" +
                            "Consejo nutricional\n" +
                            "Puedes utilizar arroz integral para incrementar tu consumo de fibra y mejorar tu digestión.",
                    R.drawable.lo
                )
            )

            listaDesayuno.add(
                ModeloReceta(
                    "Atole de leche",
                    "Baja",
                    "20 minutos",
                    2,
                    "1/2 pera sin cáscara4 Tazas Agua\n" +
                            "1 Taza Fécula de maíz disuelta en 1/4 de taza de agua\n" +
                            "2 Tazas Leche Evaporada CARNATION® CLAVEL®\n" +
                            "1 Taza Azúcar\n" +
                            "1 Cucharadita Esencia de vainilla\n" +
                            "3 Piezas Canela en raja\n",
                    "Licuar\n" +
                            "Licua la Leche Evaporada CARNATION® CLAVEL® junto con la fécula, el azúcar, la vainilla y la canela. Deja que hierva por 10 minutos para que espese.\n" +
                            "\n" +
                            "Servir\n" +
                            "Retira las rajitas de canela y puedes acompañar con canela en polvo.\n" +
                            "\n" +
                            "Consejo culinario\n" +
                            "Acompaña con unas galletas o pan dulce.\n" +
                            "\n" +
                            "Consejo nutricional\n" +
                            "La leche y productos lácteos se encuentran entre los más altos proveedores de calcio fácilmente absorbible. El consumo de 3 porciones de lácteos al día puede proporcionar la mayoría de los requerimientos diarios de calcio.",
                    R.drawable.lo
                )
            )
            return listaDesayuno
        }
    }
}