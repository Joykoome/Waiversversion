package com.example.Waivers.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDateTime;

@Entity(name="waivers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Waivers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long loanId;
    @Column(nullable = false)
    private Long customerId;
    @Column(nullable = false)
    private Long lateFee;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "waiver_type_id", referencedColumnName = "id")
    private Waivertype waivertype;



}

