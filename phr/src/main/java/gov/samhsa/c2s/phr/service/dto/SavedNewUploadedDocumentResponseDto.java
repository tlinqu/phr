package gov.samhsa.c2s.phr.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SavedNewUploadedDocumentResponseDto {
    @NotEmpty
    private Long id;

    @NotEmpty
    private String fileName;

    @NotEmpty
    private String documentName;

    @NotEmpty
    private String contentType;

    private String description;

    @NotEmpty
    private Long documentTypeCodeId;

    @NotEmpty
    private String documentTypeDisplayName;

    /* This variable should always be false in this class.
    It is needed for compatibility with front-end code. */
    private final boolean isSampleDocument = false;
}
