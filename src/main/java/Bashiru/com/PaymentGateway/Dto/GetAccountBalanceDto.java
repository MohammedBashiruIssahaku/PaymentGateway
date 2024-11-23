package Bashiru.com.PaymentGateway.Dto;

public record GetAccountBalanceDto(
        String availableBalance,
        String currency
) {
}
