package com.domain.interactor.category

import com.domain.entity.Category
import com.domain.interactor.base.SingleUseCase
import com.domain.repository.CategoryRepository
import io.reactivex.Single
import javax.inject.Inject

class CategoryListUseCase @Inject constructor(private val categoryRepository: CategoryRepository) :
        SingleUseCase<List<Category>, CategoryListUseCase.Params>() {

    override fun buildUseCaseSingle(params: Params): Single<List<Category>> {
        return with(params) {
            categoryRepository.getCategoryList(perPage, paginationValue)
        }
    }

    data class Params(
            val perPage: Int,
            val paginationValue: String?
    )
}