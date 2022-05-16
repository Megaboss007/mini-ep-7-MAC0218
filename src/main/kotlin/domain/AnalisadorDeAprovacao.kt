package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

 private lateinit var criterioescolhido : CriterioDeAprovacao
    fun defineCriterio(criterio: CriterioDeAprovacao) {
       criterioescolhido= criterio
    }

    fun fechaBoletim(boletim: Boletim) : BoletimFechado{
      val estaAprovado = criterioescolhido.estaAprovado(boletim)
        val mediaFinal = criterioescolhido.mediaFinal(boletim)
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, mediaFinal, estaAprovado)
    }

}
