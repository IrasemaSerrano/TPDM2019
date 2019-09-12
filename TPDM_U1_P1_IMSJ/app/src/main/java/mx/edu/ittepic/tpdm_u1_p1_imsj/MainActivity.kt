package mx.edu.ittepic.tpdm_u1_p1_imsj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var kelly : ImageView ?= null
    var familia : ImageView ?= null
    var mama : ImageView ?= null
    var brayan : ImageView ?= null
    var mamalute : ImageView ?= null
    var tialaura : ImageView ?= null
    var kuri : ImageView ?= null
    var jona : ImageView ?= null
    var betza : ImageView ?= null
    var papa : ImageView ?= null
    var hermanita : ImageView ?= null
    var kuriblanca : ImageView ?= null
    var poke : ImageView ?= null
    var yo : ImageView ?= null
    var tias : ImageView ?= null
    var primos : ImageView ?= null
    var tios : ImageView ?= null
    var aline : ImageView ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelly = findViewById(R.id.kelly)
        familia = findViewById(R.id.familia)
        mama = findViewById(R.id.mama)
        brayan = findViewById(R.id.brayan)
        mamalute = findViewById(R.id.mamalute)
        tialaura = findViewById(R.id.tialaura)
        kuri = findViewById(R.id.kuri)
        jona = findViewById(R.id.jona)
        betza = findViewById(R.id.betza)
        papa = findViewById(R.id.papa)
        hermanita = findViewById(R.id.hermanita)
        kuriblanca = findViewById(R.id.kuriblanca)
        poke = findViewById(R.id.poke)
        yo = findViewById(R.id.yo)
        tias = findViewById(R.id.tias)
        primos = findViewById(R.id.primos)
        tios = findViewById(R.id.tios)
        aline = findViewById(R.id.aline)

        kelly?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 1)
            fotoengrande.putExtra("nom", "Kelly")
            fotoengrande.putExtra("desc", "Cuando mi hermanita tenía poco de nacida y aprendio por primera vez a agarrar el chupón y meterselo a la boquita.")
            startActivity(fotoengrande)
        }
        familia?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 2)
            fotoengrande.putExtra("nom", "Familia")
            fotoengrande.putExtra("desc", "La navidad pasada, la cual celebramos en Compostela en la casa de mi abuelita. Jonathan y su mamá fueron a llevarme mi regalo :)")
            startActivity(fotoengrande)
        }
        mama?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 3)
            fotoengrande.putExtra("nom", "Mama")
            fotoengrande.putExtra("desc", "El primer torneo de Tae Kwon Do de mi hermano, en el que le tumbo el diente a su contrincante y mi madre se moría de angustia por el niño.")
            startActivity(fotoengrande)
        }
        brayan?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 4)
            fotoengrande.putExtra("nom", "Brayan")
            fotoengrande.putExtra("desc", "My sobrinito nos visito desde Higuera Gorda y mi mamá le puso el traje de wixarika que era de su papá, mi hermano. También a mi hermanita la vistio, con mi camisa de cuando era niña.")
            startActivity(fotoengrande)
        }
        mamalute?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 5)
            fotoengrande.putExtra("nom", "Abuela")
            fotoengrande.putExtra("desc", "Mi abuela y yo fuimos a una quinceñera, sobrina de doña Marisa, en el casino el terrerno.")
            startActivity(fotoengrande)
        }
        tialaura?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 6)
            fotoengrande.putExtra("nom", "Tia Laura")
            fotoengrande.putExtra("desc", "Fuimos a Huinamota como cada año, mis tías y mi abuela se fueron vestidas con su traje típico :D")
            startActivity(fotoengrande)
        }
        kuri?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 7)
            fotoengrande.putExtra("nom", "Kuri Mayra")
            fotoengrande.putExtra("desc", "Nos invitaron a Vallarta de vacaciones y fuimos a un viaje en lancha por el mar.")
            startActivity(fotoengrande)
        }
        jona?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 8)
            fotoengrande.putExtra("nom", "Jonathan")
            fotoengrande.putExtra("desc", "Cuando Jonathan estaba pequeñito y salio de preescolar.")
            startActivity(fotoengrande)
        }
        betza?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 9)
            fotoengrande.putExtra("nom", "Betzabel")
            fotoengrande.putExtra("desc", "En mi rancho EL Roble, existe un cerro sagrado llamdo el cerro de Dios, mi primita queria ir a pasear y fuimos un rato a disfrutar de las bellezas naturales.")
            startActivity(fotoengrande)
        }
        papa?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 10)
            fotoengrande.putExtra("nom", "Papá")
            fotoengrande.putExtra("desc", "Mi papá vestido de Wixarika, en una reunión de trabajo, le conseguimos el traje prestado y le quedo algo chico.")
            startActivity(fotoengrande)
        }
        hermanita?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 11)
            fotoengrande.putExtra("nom", "Hermanita")
            fotoengrande.putExtra("desc", "Mi hermanita el día de navidad, le compre la muñeca que se puede pintar que tanto quería, que por cierto ni siquiera juega con ella.")
            startActivity(fotoengrande)
        }
        kuriblanca?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 12)
            fotoengrande.putExtra("nom", "Kuri Blanca")
            fotoengrande.putExtra("desc", "Mi prima con su familia, estuvo todo el tiempo cercas de nosotros, pero se caso y su esposo se la llevo a E.U.")
            startActivity(fotoengrande)
        }
        poke?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 13)
            fotoengrande.putExtra("nom", "Poke")
            fotoengrande.putExtra("desc", "En navidad a mi hermano le regalaron unos lentes 3D, cuando recién salieron y el estaba aprendiendo a usarlos.")
            startActivity(fotoengrande)
        }
        yo?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 14)
            fotoengrande.putExtra("nom", "Yo")
            fotoengrande.putExtra("desc", "La única foto mía que tengo de cuando era chiquita, es un cuadro y es de mi abuela, ella me la mando tomar.")
            startActivity(fotoengrande)
        }
        tias?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 15)
            fotoengrande.putExtra("nom", "Tias")
            fotoengrande.putExtra("desc", "Mi tía nena y mi tía Lupe en un curso en la sección 20.")
            startActivity(fotoengrande)
        }
        primos?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 16)
            fotoengrande.putExtra("nom", "Primos")
            fotoengrande.putExtra("desc", "Los hijos de mi tía Laura cuando fuimos a la feria.")
            startActivity(fotoengrande)
        }
        tios?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 17)
            fotoengrande.putExtra("nom", "Tìos")
            fotoengrande.putExtra("desc", "Andabamos en el jaripeo de las fiestas de mi rancho, en la foto está mi tío Moy, su hija, mi tío Juan, mi papá, Kelly y Poke.")
            startActivity(fotoengrande)
        }
        aline?.setOnClickListener {
            var fotoengrande = Intent(this, Main2Activity::class.java)
            fotoengrande.putExtra("id", 18)
            fotoengrande.putExtra("nom", "Aline")
            fotoengrande.putExtra("desc", "En la hermosa playa Madagascar, disfrutando de las vacaciones en el mar.")
            startActivity(fotoengrande)
        }

    }
}
