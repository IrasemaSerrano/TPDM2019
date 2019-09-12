package mx.edu.ittepic.tpdm_u1_p1_imsj

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    var nom : TextView ?= null
    var des : TextView ?= null
    var imagen : ImageView ?= null
    var regresar : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nom = findViewById(R.id.nombre)
        des = findViewById(R.id.descripcion)
        imagen = findViewById(R.id.img)
        regresar = findViewById(R.id.btn)

        nom?.setText(intent.extras?.getString("nom"))
        des?.setText(intent.extras?.getString("desc"))

        when (intent.extras?.getInt("id")) {
            1 -> imagen?.setImageResource(R.drawable.kelly)
            2 -> imagen?.setImageResource(R.drawable.familia)
            3 -> imagen?.setImageResource(R.drawable.mama)
            4 -> imagen?.setImageResource(R.drawable.brayan)
            5 -> imagen?.setImageResource(R.drawable.mamalute)
            6 -> imagen?.setImageResource(R.drawable.tialaura)
            7 -> imagen?.setImageResource(R.drawable.kuri)
            8 -> imagen?.setImageResource(R.drawable.jona)
            9 -> imagen?.setImageResource(R.drawable.betza)
            10 -> imagen?.setImageResource(R.drawable.papa)
            11 -> imagen?.setImageResource(R.drawable.hermanita)
            12 -> imagen?.setImageResource(R.drawable.kuriblanca)
            13 -> imagen?.setImageResource(R.drawable.poke)
            14 -> imagen?.setImageResource(R.drawable.yo)
            15 -> imagen?.setImageResource(R.drawable.tias)
            16 -> imagen?.setImageResource(R.drawable.primos)
            17 -> imagen?.setImageResource(R.drawable.tios)
            18 -> imagen?.setImageResource(R.drawable.aline)
            else -> {
                print(":)")
            }
        }

        regresar?.setOnClickListener {
            finish()
        }

    }

}
