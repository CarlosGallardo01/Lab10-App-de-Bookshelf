package com.example.bookshelf.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.bookshelf.network.BookApi
import com.example.bookshelf.network.BookItem

sealed interface BooksUiState {
    data class Success(val books: List<BookItem>) : BooksUiState
    data class Error(val message: String) : BooksUiState
    object Loading : BooksUiState
}

class BooksViewModel : ViewModel() {
    var booksUiState: BooksUiState by mutableStateOf(BooksUiState.Loading)
        private set

    init {
        getBooks()
    }

    fun getBooks() {
        viewModelScope.launch {
            booksUiState = BooksUiState.Loading
            booksUiState = try {
                val result = BookApi.retrofitService.getBooks("jazz history")
                BooksUiState.Success(result.items ?: emptyList())
            } catch (e: Exception) {
                BooksUiState.Error(e.toString())
            }
        }
    }
}