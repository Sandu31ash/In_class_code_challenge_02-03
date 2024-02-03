package lk.ijse.inclasscodechallenge_02_03.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SDTO implements Serializable {
    private String id;
    private String name;
}
