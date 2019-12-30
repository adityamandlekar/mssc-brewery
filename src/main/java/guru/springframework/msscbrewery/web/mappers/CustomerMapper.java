package guru.springframework.msscbrewery.web.mappers;
import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtotoCustomer(CustomerDto dto);
    CustomerDto CustomertoCustomerDto(Customer customer);
}

