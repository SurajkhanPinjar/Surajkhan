import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductsImagesComponent } from './products-images.component';

describe('ProductsImagesComponent', () => {
  let component: ProductsImagesComponent;
  let fixture: ComponentFixture<ProductsImagesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductsImagesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductsImagesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
