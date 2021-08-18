package com.br.freitastiago.businesscard

import android.app.Application
import com.br.freitastiago.businesscard.data.AppDatabase
import com.br.freitastiago.businesscard.data.BusinessCardRepository

class App : Application() {

    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }

}