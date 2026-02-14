package oop_00000128606_keishaarialai.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        if (loanDuration > 3) {
            return (loanDuration - 3) * 2000
        } else {
            return 0
        }
    }
}