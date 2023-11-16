package models;

import lombok.Data;

@Data
public class DataPojo {
    private RegistrationPojo registration;
    private PersonalDetailsPojo personalDetails;
    private FinancialDetailsPojo financialDetails;
    private TradingExperiencePojo tradingExperience;
}
