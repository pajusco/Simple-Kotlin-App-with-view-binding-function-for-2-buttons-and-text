package co.pajus.texte_buch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import co.pajus.texte_buch.databinding.ActivityMainBinding

// PRZYKLAD STOSOWANIA NOWEGO SYSTEMU VIEWBIND do tworzenia objetkow z pliku xml //
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buVerbinden.setOnClickListener {
            val textEins = "Hallo Welt"
            val textZwei = "Guten Morgen"
            var textDrei:String
            textDrei = "Guten Abend"

            val ausgabe = "Verbinden:\n" + textEins + "\n" + textZwei + "\n" + textDrei
            binding.tvAusgabe.text = ausgabe
        }
        binding.buFormatieren.setOnClickListener {
            val textEins = "Das"
            val textZwei = "Willkommen"
            var textDrei = textEins
            textDrei += " ist"
            textDrei += " ein langer Satz"
            binding.tvAusgabe.text = "Formatieren : \n%s\n%s".format(textZwei, textDrei)


        }

    }

}