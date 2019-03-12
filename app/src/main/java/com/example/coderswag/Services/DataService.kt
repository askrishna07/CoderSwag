package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
        val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")

        )

    val shirts = listOf(
        Product("Shirt One", "$200", "shirt1"),
        Product("Shirt Two", "$210", "shirt2"),
        Product("Shirt Three", "$250", "shirt3"),
        Product("Shirt Four", "$250", "shirt4"),
        Product("Shirt Five", "$225", "shirt5"),
        Product("Shirt One", "$200", "shirt1"),
        Product("Shirt Two", "$210", "shirt2"),
        Product("Shirt Three", "$250", "shirt3"),
        Product("Shirt Four", "$250", "shirt4"),
        Product("Shirt Five", "$225", "shirt5"),
        Product("Shirt One", "$200", "shirt1"),
        Product("Shirt Two", "$210", "shirt2"),
        Product("Shirt Three", "$250", "shirt3"),
        Product("Shirt Four", "$250", "shirt4"),
        Product("Shirt Five", "$225", "shirt5")
    )

    val hoodies = listOf(
        Product("Hoodie One", "$50", "hoodie1"),
        Product("Hoodie Two", "$70", "hoodie2"),
        Product("Hoodie Three", "$90", "hoodie3"),
        Product("Hoodie Four", "$60", "hoodie4"),
        Product("Hoodie One", "$50", "hoodie1"),
        Product("Hoodie Two", "$70", "hoodie2"),
        Product("Hoodie Three", "$90", "hoodie3"),
        Product("Hoodie Four", "$60", "hoodie4"),
        Product("Hoodie One", "$50", "hoodie1"),
        Product("Hoodie Two", "$70", "hoodie2"),
        Product("Hoodie Three", "$90", "hoodie3"),
        Product("Hoodie Four", "$60", "hoodie4")
    )

    val hats = listOf(
        Product("Hat One", "$10", "hat1"),
        Product("Hat Teo", "$20", "hat2"),
        Product("Hat Three", "$30", "hat3"),
        Product("Hat Foir", "$40", "hat4"),
        Product("Hat One", "$10", "hat1"),
        Product("Hat Teo", "$20", "hat2"),
        Product("Hat Three", "$30", "hat3"),
        Product("Hat Foir", "$40", "hat4"),
        Product("Hat One", "$10", "hat1"),
        Product("Hat Teo", "$20", "hat2"),
        Product("Hat Three", "$30", "hat3"),
        Product("Hat Foir", "$40", "hat4")
    )
    val digitalGood = listOf<Product>()

    fun getProduct (category : String): List<Product> {
        return when(category){
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGood
            }
        }
    }

