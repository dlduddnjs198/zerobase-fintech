package com.zerobase.api.loan.request

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fintech/api/vq")
class LoanRequestController(
    private val loanRequestServiceImpl: LoanReqeustServiceImpl
) {

    @PostMapping("/request")
    fun loanRequest(
        @RequestBody loanRequestInputDto: LoanRequestDto.LoanRequestInputDto
    ): ResponseEntity<LoanRequestDto.LoanRequestResponseDto>{
        return ResponseEntity.ok(loanRequestServiceImpl.loanRequestMain(loanRequestInputDto))
    }
}