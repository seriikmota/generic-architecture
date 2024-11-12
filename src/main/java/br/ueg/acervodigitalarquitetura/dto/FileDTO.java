package br.ueg.acervodigitalarquitetura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FileDTO {
    private Long id;
    private String contentType;
    private String fileName;
    private byte[] file;
}