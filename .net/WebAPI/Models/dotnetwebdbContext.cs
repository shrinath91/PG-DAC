using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata;

namespace WebAPI.Models
{
    public partial class dotnetwebdbContext : DbContext
    {
        public dotnetwebdbContext()
        {
        }

        public dotnetwebdbContext(DbContextOptions<dotnetwebdbContext> options)
            : base(options)
        {
        }

        public virtual DbSet<Emp> Emps { get; set; } = null!;

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see http://go.microsoft.com/fwlink/?LinkId=723263.
                optionsBuilder.UseMySql("server=localhost;port=3306;user=root;password=root;database=dotnetwebdb", Microsoft.EntityFrameworkCore.ServerVersion.Parse("8.0.34-mysql"));
            }
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.UseCollation("utf8mb4_0900_ai_ci")
                .HasCharSet("utf8mb4");

            modelBuilder.Entity<Emp>(entity =>
            {
                

                entity.ToTable("emp");

                entity.Property(e => e.Id).ValueGeneratedNever();

                entity.Property(e => e.Address)
                    .HasMaxLength(45)
                    .HasColumnName("address");

                entity.Property(e => e.Gender)
                    .HasMaxLength(10)
                    .HasColumnName("gender");

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.Name)
                    .HasMaxLength(45)
                    .HasColumnName("name");

                entity.Property(e => e.Salary).HasColumnName("salary");
            });

            OnModelCreatingPartial(modelBuilder);
        }

        partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
    }
}
