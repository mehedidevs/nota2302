package com.mehedi.nota2302.di

import android.content.Context
import androidx.room.Room
import com.mehedi.nota2302.db.ContactDao
import com.mehedi.nota2302.db.ContactDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DBProvider {

    @Provides
    @Singleton
    fun providesDb(@ApplicationContext context: Context): ContactDatabase {
        return ContactDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun providesDao(db: ContactDatabase): ContactDao {
        return db.getContactDao()
    }


}