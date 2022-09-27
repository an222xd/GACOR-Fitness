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
 * imagen: Int; Recursos drawable
 *  Regresa un ArrayList
 */

class datosComida {

    companion object {

        fun creacionDatosComida(): ArrayList<ModeloReceta> {
            val listaComida = ArrayList<ModeloReceta>()
            listaComida.add(
                ModeloReceta(
                    "Chiles rellenos de picadillo",
                    "Media",
                    "50 minutos",
                    1,
                    "1 Cucharada Aceite de maíz\n" +
                            "1/4 Pieza Cebolla picada finamente\n" +
                            "800 Gramos Carne de res molida\n" +
                            "3 Piezas Jitomate cortados en cuartos y sin semillas\n" +
                            "1 1/2 Taza Puré de tomate\n" +
                            "1 Pieza *Chile chipotle adobado, de lata\n" +
                            "1 Cubo Concentrado de Tomate con Pollo CONSOMATE®\n" +
                            "1 Pieza Papa cocida y cortada en cubos\n" +
                            "1/2 Taza Zanahorias congelados\n" +
                            "1/4 Taza Chícharos\n" +
                            "2 Piezas Chile guajillo remojados en agua caliente y sin semillas\n" +
                            "1 Lata Leche Evaporada CARNATION® CLAVEL®\n" +
                            "1 Taza Agua\n" +
                            "1 Cucharada *Fécula de maíz disuelta en ¼ taza de agua\n" +
                            "1 Cucharadita Sal con cebolla en polvo\n" +
                            "4 Piezas Chile poblano limpios\n" +
                            "1 Cucharada Jugo MAGGI®\n" +
                            "1 Cucharada Salsa Tipo Inglesa MAGGI®\n" +
                            "1/2 Taza Harina de maíz\n" +
                            "4 Piezas Clara de huevo\n" +
                            "2 Piezas Yema\n" +
                            "1 Cucharadita Ajo picado finamente",
                    "Calentar\n" +
                            "Para el picadillo, calienta el aceite y fríe la cebolla hasta que esté transparente, añade el ajo con la carne, el Jugo MAGGI®, la Salsa Tipo Inglesa CROSSE & BLACKWELL® y cocina por 5 minutos. Agrega las papas, las zanahorias y los chícharos previamente descongelados, cocina por 2 minutos más y reserva.\n" +
                            "\n" +
                            "Licuar\n" +
                            "Para la salsa, licúa el puré de tomate, los chiles, el agua, el Concentrado de Tomate con Pollo CONSOMATE® y la sal con cebolla. Vierte en una olla y calienta hasta que espese ligeramente, moviendo para que no se pegue.\n" +
                            "\n" +
                            "Servir\n" +
                            "Rellena los chiles con el picadillo, asegura con un palillo y enharina ligeramente y reserva. Bate las claras a punto de turrón, agrega las yemas y cubre los chiles. Fríe en el aceite caliente, escurre el exceso de grasa, sirve en un plato y baña con la salsa.\n" +
                            "\n" +
                            "Consejo culinario\n" +
                            "Puedes gratinar los chiles con un poco de Queso Tipo Manchego NESTLÉ®.\n" +
                            "\n" +
                            "Consejo nutricional\n" +
                            "El jitomate y la cebolla contienen potasio, el cual ayuda a la contracción muscular.\n" +
                            "\n",
                    R.drawable.lo
                )
            )
            listaComida.add(
                ModeloReceta(
                    "Hotcakes de manzana con avena",
                    "Baja",
                    "16 minutos",
                    2,
                    "1/2 plátano\n" +
                            "6 cucharadas de Nestum® Cereal infantil Avena\n" +
                            "suficiente de aceite en aerosol\n" +
                            "1/2 manzana",
                    "En un bowl, machaca el plátano hasta hacerlo puré, agrega Nestum® Cereal infantil Avena y la manzana.\n" +
                            "En un sartén a fuego medio, agrega un poco de aceite en aerosol y vierte un poco de la mezcla de hotcakes, cocina por 3 minutos de cada lado.\n" +
                            "Sirve en un platito para bebé.",
                    R.drawable.lo
                )
            )

            listaComida.add(
                ModeloReceta(
                    "Quesadillas de tinga de res",
                    "Baja",
                    "54 minutos",
                    2,
                    "2 Cucharadas Aceite de maíz para la tinga\n" +
                            "1 1/2 Pieza Cebolla fileteadas, para la tinga\n" +
                            "500 Gramos Falda de res cocida y deshebrada, para la tinga\n" +
                            "4 Piezas Jitomate cortados en cuartos y sin semillas, para la tinga\n" +
                            "1 Cubo Concentrado de Tomate con Pollo CONSOMATE® para la tinga\n" +
                            "1/2 Taza Agua para la tinga\n" +
                            "3/4 Taza Manteca de cerdo para la masa\n" +
                            "600 Gramos Masa para tortillas de maíz\n" +
                            "1/4 Cucharadita Polvo para hornear para la masa\n" +
                            "2 Cucharadas Consomé de pollo en polvo para la masa ½ taza de agua, para la masa",
                    "Calentar\n" +
                            "Para la tinga, calienta el aceite y fríe la cebolla hasta que esté transparente; agrega la carne y cocina 5 minutos más. Licúa el jitomate con el Concentrado de Tomate con Pollo CONSOMATE® y el agua; añade a la preparación anterior y continúa la cocción durante 10 minutos más.\n" +
                            "\n" +
                            "Batir\n" +
                            "Para la masa, bate la manteca hasta que esté suave, agrega poco a poco la masa de maíz, el polvo para hornear, el consomé de pollo y el agua. Forma una bolita con un poco de masa, aplana y rellena con un poco de tinga; cierra y forma las quesadillas presionando las orillas.\n" +
                            "\n" +
                            "Freír\n" +
                            "Fríe las quesadillas en el aceite caliente hasta que estén doradas, retira del fuego y coloca en papel absorbente para retirar el exceso de aceite. Ofrece acompañado de la salsa de tu preferencia.\n" +
                            "\n" +
                            "Consejo culinario\n" +
                            "Puedes utilizar una máquina manual para tortillas con una bolsa de plástico en el interior, para aplanar la masa y formar las quesadillas.\n" +
                            "\n" +
                            "Consejo nutricional\n" +
                            "El maíz es un cereal integral rico en fibra, por lo que ayuda a tener un sistema gastrointestinal saludable.",
                    R.drawable.lo
                )
            )
            return listaComida
        }
    }
}