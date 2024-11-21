package com.example.praktikum7_176.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStudiUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy(namaMK = mkPilihan)}
    }

    fun setKelas(kelasPilihan: String) {
        _krsState.update {stateKelas -> stateKelas.copy(kelas = kelasPilihan)}
    }

    fun SaveDataKRS(ls: MutableList<String>) {
        _krsState.update { status -> status.copy(
            namaMK = ls[0],
            kelas = ls[1]
        )}
    }
}