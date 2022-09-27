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

class datosCena {

    companion object {

        fun creacionDatosCena(): ArrayList<ModeloReceta> {
            val llistaCena = ArrayList<ModeloReceta>()
            llistaCena.add(
                ModeloReceta(
                    "Ensalada de pasta con atún",
                    "Media",
                    "3 horas 26 minutos",
                    4,
                    "\n" +
                            " 1/4 taza de mayonesa reducida en grasa KRAFT Light Mayo Reduced Fat Mayonnaise\n" +
                            " 1/4 cucharadita de hojas secas de eneldo\n" +
                            " 1 taza de pasta de coditos, cocida\n" +
                            " 1 taza de chícharos (guisantes o arvejas) congelados\n" +
                            " 1 lata (5 oz) de atún blanco en agua, escurrido y desmenuzado\n" +
                            " 1/2 taza de cebolla morada picada",
                    "Mezcla bien la mayonesa y el eneldo.\n" +
                            "2\n" +
                            "Combina los ingredientes restantes en un tazón mediano. Agrégale la mezcla de mayonesa; mézclalos ligeramente.\n" +
                            "3\n" +
                            "Refrigera la ensalada durante varias horas o hasta que esté fría.",
                    R.drawable.lo
                )
            )
            llistaCena.add(
                ModeloReceta(
                    "Ensalada de pollo, mango y espinaca",
                    "Baja",
                    "10 minutos",
                    5,
                    "1 bolsa (10 onzas) de hojas tiernas de espinaca\n" +
                            " 1 mango mediano, pelado y rebanado\n" +
                            " 1 aguacate mediano, pelado y rebanado\n" +
                            " 1 cebolla morada, pequeña, rebanada finamente\n" +
                            " 2/3 taza de vinagreta de frambuesas reducida en grasa KRAFT Lite Raspberry Vinaigrette Dressing\n" +
                            " 2 tazas de tiritas de pollo cocido (aproximadamente 10 onzas)",
                    "Mezcla la espinaca con el mango, el aguacate y la cebolla en un recipiente grande. Agrega el aderezo y mezcla ligeramente.\n" +
                            "Reparte con una cuchara entre 5 platos; corona con el pollo.\n" +
                            "Sirve inmediatamente.",
                    R.drawable.lo
                )
            )

            llistaCena.add(
                ModeloReceta(
                    "Salteado de carne de res estilo oriental",
                    "Baja",
                    "30 minutos",
                    4,
                    "1 taza de arroz blanco de grano largo, sin cocer\n" +
                            " 1 libra de bistec de aguayón (beef sirloin steak) sin hueso, cortado en tiras finas\n" +
                            " 2 cucharaditas de ajo bien picadito\n" +
                            " 1 paquete (16 oz) de verduras (vegetales) congeladas para salteado, escurridas (descongélalas antes de usar)\n" +
                            " 1/4 taza de aderezo oriental con ajonjolí tostado reducido en grasa KRAFT Lite Asian Toasted Sesame Dressing\n" +
                            " 1/4 taza de salsa de soya reducida en sodio",
                    "Cocina el arroz como lo indica el paquete, pero omite la sal.\n" +
                            "Sofríe la carne y el ajo en una sartén antiadherente grande, rociada con aceite en aerosol, a fuego medio-alto durante 2 min. Incorpora las verduras, el aderezo y la salsa de soya; sofríelos 3 min. o hasta que la carne se cocine.\n" +
                            "Coloca el arroz en un platón; ponle encima la mezcla de carne.",
                    R.drawable.lo
                )
            )
            return llistaCena
        }
    }
}