package com.kotlinegitim.plakasehirbulma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlinegitim.plakasehirbulma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val plakaKodlari = mapOf(
            1 to "Adana", 2 to "Adıyaman", 3 to "Afyonkarahisar", 4 to "Ağrı", 5 to "Amasya",
            6 to "Ankara", 7 to "Antalya", 8 to "Artvin", 9 to "Aydın", 10 to "Balıkesir",
            11 to "Bilecik", 12 to "Bingöl", 13 to "Bitlis", 14 to "Bolu", 15 to "Burdur",
            16 to "Bursa", 17 to "Çanakkale", 18 to "Çankırı", 19 to "Çorum", 20 to "Denizli",
            21 to "Diyarbakır", 22 to "Edirne", 23 to "Elazığ", 24 to "Erzincan", 25 to "Erzurum",
            26 to "Eskişehir", 27 to "Gaziantep", 28 to "Giresun", 29 to "Gümüşhane", 30 to "Hakkâri",
            31 to "Hatay", 32 to "Isparta", 33 to "Mersin", 34 to "İstanbul", 35 to "İzmir",
            36 to "Kars", 37 to "Kastamonu", 38 to "Kayseri", 39 to "Kırklareli", 40 to "Kırşehir",
            41 to "Kocaeli", 42 to "Konya", 43 to "Kütahya", 44 to "Malatya", 45 to "Manisa",
            46 to "Kahramanmaraş", 47 to "Mardin", 48 to "Muğla", 49 to "Muş", 50 to "Nevşehir",
            51 to "Niğde", 52 to "Ordu", 53 to "Rize", 54 to "Sakarya", 55 to "Samsun",
            56 to "Siirt", 57 to "Sinop", 58 to "Sivas", 59 to "Tekirdağ", 60 to "Tokat",
            61 to "Trabzon", 62 to "Tunceli", 63 to "Şanlıurfa", 64 to "Uşak", 65 to "Van",
            66 to "Yozgat", 67 to "Zonguldak", 68 to "Aksaray", 69 to "Bayburt", 70 to "Karaman",
            71 to "Kırıkkale", 72 to "Batman", 73 to "Şırnak", 74 to "Bartın", 75 to "Ardahan",
            76 to "Iğdır", 77 to "Yalova", 78 to "Karabük", 79 to "Kilis", 80 to "Osmaniye",
            81 to "Düzce"
        )
        binding.button.setOnClickListener{
            if (binding.editTextNumber.text.isNotEmpty()){
                val plakaKodu = binding.editTextNumber.text.toString().toInt()
                if (plakaKodlari.containsKey(plakaKodu)) {
                    val sehir = plakaKodlari[plakaKodu]!!
                    binding.textView.text = sehir
                } else {
                    binding.textView.text = "Plaka kodu bulunamadı."
                }
            }
            else{
                binding.textView.text = "Şehir plaka kodunu giriniz."
            }

        }

    }
}